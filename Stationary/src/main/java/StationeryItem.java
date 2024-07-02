import io.vertx.core.json.JsonObject;

public class StationeryItem {
    private String itemId;
    private String name;
    private String category;
    private double price;
    private int quantityInStock;

    public StationeryItem() {}

    public StationeryItem(String itemId, String name, String category, double price, int quantityInStock) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public JsonObject toJson() {
        return new JsonObject()
                .put("itemId", itemId)
                .put("name", name)
                .put("category", category)
                .put("price", price)
                .put("quantityInStock", quantityInStock);
    }

    public static StationeryItem fromJson(JsonObject json) {
        return new StationeryItem(
                json.getString("itemId"),
                json.getString("name"),
                json.getString("category"),
                json.getDouble("price"),
                json.getInteger("quantityInStock")
        );
    }

    // Getters and setters...
}
