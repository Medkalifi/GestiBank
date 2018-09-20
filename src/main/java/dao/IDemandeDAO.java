package dao;

import java.util.List;

import entities.Demande;
import entities.DemandeMdp;
import entities.Document;

public interface IDemandeDAO {

	// Gestion des demandes en attente
				public Demande ajouterDemande(Demande ajouter_demande);
				public List<Demande> getDemande(Demande demande);
				public List<Demande> getDemandesAffect(Demande affect_demande);
				public List<Demande> getDemandeStatut(Demande statut_demande);
				public List<Demande> getDemandeDate(Demande Date_demande);
				public List<Demande> getDemandeAffectDate(Demande Date_Affect_demande);
				public List<Demande> getDemandeByUser(Long codeuser);
				
				/*demande*/
				public void demanderChequier(String cpte);
				public void CreationCompte(String cpte);
				public void validerDemande(Long codecpte);
				public DemandeMdp ChangementMdp(String Mdp, String cpte);
				public  List<Document> AjouterDocument(String cpte);
				public List<Demande> getDemandesAffectes(Long idAg);
				
	
}
