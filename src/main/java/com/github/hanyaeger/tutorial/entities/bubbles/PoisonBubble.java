package com.github.hanyaeger.tutorial.entities.bubbles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import javafx.scene.paint.Color;

public class PoisonBubble extends DynamicCircleEntity {
    public int speed;
    public PoisonBubble(Coordinate2D initialLocation, int speed) {
        super(initialLocation);
        this.speed = speed;

        setStrokeColor(Color.BLACK);
        setFill(Color.GREEN);
        setRadius(20);
        setOpacity(0.3);

        setMotion(speed, Direction.UP);

    }
}
