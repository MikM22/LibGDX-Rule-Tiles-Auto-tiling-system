package com.src.com.mikm;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class RuleCell {
    public TextureRegion[][] spritesheet;
    public RuleCellMetadata metadata;
    public RuleCell(TextureRegion[][] spritesheet, RuleCellMetadata metadata) {
        this.spritesheet = spritesheet;
        this.metadata = metadata;
    }
}
