package metier;



import java.util.Date;
import java.util.List;

import javax.management.Notification;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import entities.Notifications;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Credit;
import entities.Debit;
import entities.Demande;
import entities.DemandeCheque;
import entities.DemandeMdp;
import entities.Document;
import entities.Transaction;
import entities.Utilisateur;



public class ImetierIMPL implements Imetier {

	
	//Compte
	

private EntityManager em;
	
	
	
	
	//Find et persist = couche dao anntotations//
	@Override
	public Compte ajouterCompte(Compte cp, Long codeCli, Long codeAg) {
		Client cli=em.find(Client.class, codeCli);
		cp.setClient(cli);
		em.persist(cp);
		return cp;
	}
	
	public Compte consulterCompte(String codeCpte) {
		Compte c = em.find(Compte.class, codeCpte);
				if (c==null) throw new RuntimeException("compte introuvable");
		return c;
	}

	
	
	@Override
	public Boolean supprimerCompte(String codeCpte, Long codeAg)  {
			if (codeCpte != null)
	            em.remove(codeCpte);
			return true;	
	}
	

	//Transaction

	
	@Override
	public Transaction ajouterTransation(Transaction tr,String numCpte) {
		Compte c =em.find(Compte.class, numCpte);
		if (tr.getMontant()+ c.getSolde()+c.getMtDecouvert()>0) {
			tr.setCompte(c);
			c.getTransactions().add(tr);
			c.setSolde(c.getSolde()+tr.getMontant());
			em.persist(tr);
		}else {
			return null; // si probleme de solde";
		}
		return tr;
	}
	

	public void verser(double mt, String cpte) {
		Compte c = em.find(Compte.class, cpte);
		double tmp = c.getSolde()+ mt;
		c.setSolde(mt);;
		em.persist(c);
		
	}
/*
	public void retirer(double mt, String cpte) {
		Compte c = em.find(Compte.class, cpte);
		double tmp = c.getSolde()- mt;
		c.setSolde(mt);;
		em.persist(c);
		
	}
	*/
	public void virement(double mt, String cpte1, String cpte2, Long codeAg) {
		retirer(mt, cpte1);
		verser(mt, cpte2);
		
	}

	@Override
	public void historique(String codeCpte) {   // a faire
		
		
		
	}
	@Override
	public List<Transaction> consulterTransaction(String codeCpte ) {
		Query req=em.createQuery("SELECT op FROM Transaction op WHERE op.compte.codeCompte=:x ");
		req.setParameter("x",codeCpte);
			return req.getResultList();
	}
	

	
		//Demande
		
	@Override
	public void affectAgentToClient(Long code_agent, Long code_lient) {
		Agent agent =em.find(Agent.class, code_agent);
		System.out.println(agent);
		Client c = em.find(Client.class, code_lient);
		agent.getListClient().add(c);
		c.setAgent(agent);	
	}

	
		@Override
		public Demande ajouterDemande(Demande ajouter_demande) {
			em.persist(ajouter_demande);
			return ajouter_demande;
		}

		@Override
		public List<Demande> getDemande(long codeuser) {
			TypedQuery<Demande> req = em.createQuery("select * from Demande d where d.exp = codeuser",Demande.class);
			List <Demande> list =req.getResultList();
			return list;
		}

		@Override
		public List<Demande> getDemandesAffect(String nom) {
			TypedQuery<Demande> req = em.createQuery("select * from Demande d where d.nom = nom",Demande.class);
			List <Demande> list =req.getResultList();
			return list;
		}

		@Override
		public List<Demande> getDemandesAffectDate(Date date) {
			TypedQuery<Demande> req = em.createQuery("select * from Demande d d.dateAffectation = date order by Date",Demande.class);
			List <Demande> list =req.getResultList();
			return list;
		}
		
		@Override
		public List<Demande> getDemandesAffectCompte(String numCompte) {
			TypedQuery<Demande> req = em.createQuery("select * from Demande d where d.idC = idC",Demande.class);
			List <Demande> list =req.getResultList();
			return list;
		}
		
		@Override
		public List<Demande> getDemandeStatut(Demande statut_demande) {
			TypedQuery<Demande> req = em.createQuery("select * from Demande d where d.statut = statut",Demande.class);
			List <Demande> list =req.getResultList();
			return list;
		}

		@Override
		public List<Demande> getDemandeDate(Date date) {
			TypedQuery<Demande> req = em.createQuery("select * from Demande d where d.dateAffectation = date order by dateAffectation",Demande.class);
			List <Demande> list =req.getResultList();
			return list;
		}


		@Override
		public void ChangementMdp(long codeuser,String Mdp) {
			Query query = em.createQuery("update Client c set u.mdp = mdp where u.codeuser=codeuser ");
			query.executeUpdate();
			
		}

		@Override
		public DemandeCheque getChequier(String numCpte) {
			return em.find(DemandeCheque.class, numCpte);
			}
			
		@Override
		public DemandeCheque getChequierParNom(String nom) {
			return em.find(DemandeCheque.class, nom);
			}
		
		
		
		//Gestion Document
		
		
		@Override
		public List<Document> findAllDocByUserId(long codeuser)  {
			TypedQuery<Document> req = em.createQuery("select * from Document d where d.codeuser=codeuser ",Document.class);
			List<Document> list = req.getResultList();
			return list;
		}
		
		/*
		
		@Override
		public void saveDoc(Document document);
		TypedQuery<Document> req = em.saveQuery("select * from Document d where d.codeuser=codeuser ",Document.class);
	
			*/
			
		@Override
	    public Boolean deleteDocById(String codeuser) {
		if (codeuser != null)
	    em.remove(codeuser);
		return true;
		}

		
		//Notification
		
				@Override
				public Notification ajouterNotification(Notification notif) {
					em.persist(notif);
					return notif;
				}
				
				
				@Override
				public List<Notifications> getNotificationsByDestinateur(Long idNotification) {
					TypedQuery<Notifications> req=em.createQuery("select codeuser from Notification notif where destinateur.id=:x ", Notifications.class);
					List<Notifications> list = req.getResultList();
					return list;
				}

				@Override
				public Compte verifierDecouvert(String codeCpte) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public void retirer(double mt, String cpte) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void saveDoc(Document document) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public Notification envoyerNotification(Notification notif) {
					// TODO Auto-generated method stub
					return null;
				}


	}
		

	




	