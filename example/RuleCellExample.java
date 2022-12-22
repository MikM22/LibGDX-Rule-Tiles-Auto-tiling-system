import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class RuleCellExample {
    AssetManager assetManager;

    private void createTiledMapRenderer() {
        //Create libGDX tilemap, add a RuleCellTiledMapTileLayer to it
        TiledMap tiledMap = new TiledMap();
        MapLayers mapLayers = tiledMap.getLayers();
        RuleCellTiledMapTileLayer tiledMapTileLayer = new RuleCellTiledMapTileLayer(16, 16, 16, 16);

        //Create a TextureRegion[][] of the possible tile images of your Rule Tile
        Texture caveTilesetSpritesheet = assetManager.get("images/caveTiles.png", Texture.class);
        TextureRegion[][] caveTileset = TextureRegion.split(caveTilesetSpritesheet, 16, 16);

        //Read Rule Tile metadata file you created
        RuleCellMetadataReader metadataReader = new RuleCellMetadataReader();
        RuleCellMetadata metadata = metadataReader.createMetadataFromFile("images/caveTiles.meta.txt");
        RuleCell ruleCell = new RuleCell(caveTileset, metadata);

        //Set the Rule Tiles wherever you want
        tiledMapTileLayer.setRuleCell(1, 1, ruleCell);
        tiledMapTileLayer.setRuleCell(2, 1, ruleCell);

        //After setting all Rule Tiles, call this function
        tiledMapTileLayer.updateRuleCells();

        //Add the libGDX tilemap to the libGDX tile renderer
        mapLayers.add(tiledMapTileLayer);
        OrthogonalTiledMapRenderer tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap, 2);
    }
}
