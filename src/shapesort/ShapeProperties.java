package shapesort;

import java.awt.Color;

public interface ShapeProperties {
	
	 default Color getColor() {
		return null;
		}

		default int getWidth() {
			return 0;
		}

		default int getHeight() {
			return 0;
		}

		default int getUpperX() {
			return 0;
		}

		default int getUpperY() {
			return 0;
		}


		// setters
		default void setColor(Color aShapeColor) {
		}

		default void setWidth(int width) {
		}

		default void setHeight(int height) {
		}

		default void setUpperX(int upperX) {
		}

		default void setUpperY(int upperY) {
		}
}
