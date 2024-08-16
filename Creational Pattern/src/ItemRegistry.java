public class ItemRegistry {

    public static void main(String[] args) {

        //Before builder pattern
//        var item1 = new StoreItem(
//                "Pretzel", 2.0, "A tasty snack", null, 7, null);
//
//        var item2 = new StoreItem(
//                "Soup", 1.5, null,
//                "A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable",
//                null, "Can");

        var item1 = new StoreItem.StoreItemBuilder("Pretezel",2.0)
                .shortDescription("A tasty Snack")
                .stockAvailable(7)
                .build();

        var item2 = new StoreItem.StoreItemBuilder("KochciBite",3.0)
                .shortDescription("A tasty and savory Snack")
                .stockAvailable(10)
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }

}
