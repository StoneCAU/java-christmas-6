package christmas.global.constants.event;

public enum EventType {
    CHRISTMAS("크리스마스 디데이 할인"),
    WEEKDAY("평일 할인"),
    WEEKEND("주말 할인"),
    SPECIAL("특별 할인"),
    GIFT("증정 이벤트");

    EventType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private final String type;
}
