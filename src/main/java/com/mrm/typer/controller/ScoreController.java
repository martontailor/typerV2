/*
 * Copyright 2018 Márton Szabó.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mrm.typer.controller;

import com.mrm.typer.model.DB.DataBase;
import com.mrm.typer.model.Result;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import org.apache.derby.impl.sql.compile.DB2LengthOperatorNode;

public class ScoreController implements Initializable {

    @FXML
    private AnchorPane anchorPane1;
    @FXML
    private Button button_back;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> playersCol;

    @FXML
    private TableColumn<?, ?> scoresCol;

    @FXML
    public void backToMain(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/MainMenu.fxml"));
        Parent root = null;
        try {
            root = (Parent) loader.load();
            anchorPane1.getChildren().clear();
            anchorPane1.getChildren().add(root);
        } catch (IOException e) {
            //TODO: LOG!
            e.printStackTrace();
        }
    }

    public void addResult(String name, String score) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
        
    }

}
