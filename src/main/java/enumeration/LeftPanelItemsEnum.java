package enumeration;

public enum LeftPanelItemsEnum {
    TEXT_BOX("Text Box"),
    CHECK_BOX("Check Box"),
    RADIO_BUTTON("Radio Button");

    LeftPanelItemsEnum(String itemName) {
        this.itemName = itemName;
    }

    private String itemName;

    public String getItemName() {
        return itemName;
    }
}
