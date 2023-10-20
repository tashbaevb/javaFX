package com.example.demojavafx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.ParallelCamera;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class PlayController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView backg1, backg2, pers;

    private final int BG_WIDTH = 580;
    private ParallelTransition parallelTransition;

    @FXML
    void initialize() {
        TranslateTransition transition = new TranslateTransition(Duration.millis(5000), backg1);
        transition.setFromX(0);
        transition.setToX(BG_WIDTH * -1);
        transition.setInterpolator(Interpolator.LINEAR);

        TranslateTransition transition2 = new TranslateTransition(Duration.millis(5000), backg2);
        transition2.setFromX(0);
        transition2.setToX(BG_WIDTH * -1);
        transition2.setInterpolator(Interpolator.LINEAR);

        parallelTransition = new ParallelTransition(transition, transition2);
        parallelTransition.setCycleCount(Animation.INDEFINITE);
        parallelTransition.play();
    }
}
