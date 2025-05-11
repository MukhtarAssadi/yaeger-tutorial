package com.github.hanyaeger.tutorial.entities.bubbles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import javafx.scene.paint.Color;

public class AirBubble extends DynamicCircleEntity {

    public int speed;
    public AirBubble(Coordinate2D initialLocation, int speed) {
        super(initialLocation);
        this.speed = speed;

        setStrokeColor(Color.BLUE);
        setFill(Color.WHITE);
        setRadius(20);
        setOpacity(0.3);

        setMotion(speed, Direction.UP);
    }



}
