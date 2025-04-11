package FlyweightPattern;

import java.util.Objects;

public final class MarkerStyle {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        if (icon == null || color == null || labelStyle == null) {
            throw new IllegalArgumentException("All fields must be non-null");
        }
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public String getIcon() {
        return icon;
    }

    public String getColor() {
        return color;
    }

    public String getLabelStyle() {
        return labelStyle;
    }

    @Override
    public String toString() {
        return "Style(" + icon + ", " + color + ", " + labelStyle + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarkerStyle)) return false;
        MarkerStyle that = (MarkerStyle) o;
        return icon.equals(that.icon) &&
                color.equals(that.color) &&
                labelStyle.equals(that.labelStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon, color, labelStyle);
    }
}
