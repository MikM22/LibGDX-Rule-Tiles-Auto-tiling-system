package com.src.com.mikm;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RuleCellMetadata {
    HashMap<Vector2Int, TileRuleset[]> tilesMetadata = new HashMap<>();

    public void addTileRulesetsForPosition(Vector2Int position, TileRuleset[] tileRulesets) {
        tilesMetadata.put(position, tileRulesets);
    }

    public void prettyPrint() {
        for (Map.Entry<Vector2Int, TileRuleset[]> entry : tilesMetadata.entrySet()) {
            Vector2Int key = entry.getKey();
            TileRuleset[] value = entry.getValue();
            for (TileRuleset tileRuleset : value) {
                System.out.println("Position: " + key.x + ", " + key.y + ". TileRuleset: " + Arrays.deepToString(tileRuleset.array));
            }
        }
    }
}

