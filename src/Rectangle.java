public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    public void Lenght(int length) {
        this.length = length;

    }
    public void Width(int width) {
        this.width = width;
    }
    public int area(int length, int width){
        return (length * width);
    }
    public int perimeter(int length, int width){
        return ((length *2) + (width *2));
    }

}
