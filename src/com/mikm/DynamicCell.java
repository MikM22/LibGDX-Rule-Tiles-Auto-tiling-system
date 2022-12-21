package com.mikm;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class DynamicCell {
    public TextureRegion[][] spritesheet;
    public DynamicCellMetadata metadata;
    public DynamicCell(TextureRegion[][] spritesheet, DynamicCellMetadata metadata) {
        this.spritesheet = spritesheet;
        this.metadata = metadata;
    }
}
