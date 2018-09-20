package dao;

import java.util.List;

import entities.Administrateur;
import entities.Agent;
import entities.Compte;
import entities.Demande;
import entities.DemandeCheque;
import entities.DemandeMdp;
import entities.Document;

public class IDemandeDAOimp implements IDemandeDAO {
	

private IgestiBankDao dao;
	
	
	public void setDao(IgestiBankDao dao) {
		this.dao = dao;
	}
	
	
	
	
	@Override
	public Demande ajouterDemande(Demande ajouter_demande) {
		// TODO Auto-generated method stub
		return  dao.ajouterDemande( ajouter_demande);
	}

	@Override
	public List<Demande> getDemande(Demande demande) {
		// TODO Auto-generated method stub
		return dao.getDemande(demande);
	}

	@Override
	public List<Demande> getDemandesAffect(Demande affect_demande) {
		// TODO Auto-generated method stub
		return dao.getDemandesAffect(affect_demande);
	}

	@Override
	public List<Demande> getDemandeStatut(Demande statut_demande) {
		// TODO Auto-generated method stub
		return dao.getDemandeStatut(statut_demande);
	}

	@Override
	public List<Demande> getDemandeDate(Demande Date_demande) {
		// TODO Auto-generated method stub
		return dao.getDemandeDate(Date_demande);
	}

	@Override
	public List<Demande> getDemandeAffectDate(Demande Date_Affect_demande) { 
		// TODO Auto-generated method stub
		return dao.getDemandeAffectDate(Date_Affect_demande);
	}

	@Override
	public List<Demande> getDemandeByUser(Long codeuser) {
		// TODO Auto-generated method stub
		
		return dao.getDemandeByUser(codeuser);
	}

	//

	@Override
	public DemandeMdp ChangementMdp(String Mdp, String cpte) {
		// TODO Auto-generated method stub
		return dao.getChangementMdp(Mdp);
	}

	@Override
	public List<Document> AjouterDocument(String cpte) {
		// TODO Auto-generated method stub
		return dao.AjouterDocument(cpte);
	}

	@Override
	public List<Demande> getDemandesAffectes(Long idAg) {
		// TODO Auto-generated method stub
		return dao.getDemandesAffectes(idAg);
	}




	




	
	}




	

