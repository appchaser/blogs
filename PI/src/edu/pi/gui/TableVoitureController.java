/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pi.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class TableVoitureController implements Initializable {

    @FXML
    private TextField resmarque;
    @FXML
    private TextField resmodel;
    @FXML
    private TextField rescouleur;
    @FXML
    private TextField resdisponibilite;
    @FXML
    private TextField resserie;
    @FXML
    private TextField resprix;
    @FXML
    private TextField resimage;
    @FXML
    private ImageView imagebox;
    @FXML
    private Button btnvoitures;
    @FXML
    private Button btnhotels;
    @FXML
    private Button btnvols;
    @FXML
    private Button btncamping;
    @FXML
    private Button btnbon_plans;
    @FXML
    private Button btnblog;
    @FXML
    private Button btnutilisateurs;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> col_id;
    @FXML
    private TableColumn<?, ?> col_name;
    @FXML
    private TableColumn<?, ?> col_email;
    @FXML
    private TableColumn<?, ?> col_description;
    @FXML
    private TableColumn<?, ?> col_image;
    @FXML
    private TextField search_bar;
    @FXML
    private Button btnadd;
    @FXML
    private Button import_image;
    @FXML
    private Hyperlink logoutLink;
    @FXML
    private ImageView logo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void supprimervoiture(ActionEvent event) {
    }

    @FXML
    private void modifiervoiture(ActionEvent event) {
    }

    @FXML
    private void voitures(MouseEvent event) {
    }

    @FXML
    private void hotels(MouseEvent event) {
    }

    @FXML
    private void vols(MouseEvent event) {
    }

    @FXML
    private void camping(MouseEvent event) {
    }

    @FXML
    private void bon_plans(MouseEvent event) {
    }

    @FXML
    private void blog(MouseEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("AddForum.fxml"));
    Parent root = loader.load();
    ForumDeatilsController c2 = loader.getController();
    }

    @FXML
    private void utilisateurs(MouseEvent event) {
    }

    @FXML
    private void showdetail(MouseEvent event) {
    }

    @FXML
    private void search(KeyEvent event) {
    }

    @FXML
    private void ajout(MouseEvent event) {
    }

    @FXML
    private void importerImageUpdate(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }
    
}
