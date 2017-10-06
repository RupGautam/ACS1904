/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab4;

import org.junit.jupiter.api.Test;

/**
 * Created by RupGautam on 29/09/2017.
 */

class myTestTest {

	@Test
	void testSomething() {
		System.out.println ( Geometry.circleArea ( 6 ) );
		System.out.println ( Geometry.rectangleArea ( 4, 6 ) );
		System.out.println ( Geometry.triangleArea ( 5, 7 ) );
		System.out.println ( Geometry.circleCircumference ( 10 ) );
		System.out.println ( Geometry.rectanglePerimeter ( 7.5, 5 ) );
		System.out.println ( Geometry.trianglePerimeter ( 3.5, 3.5, 7.5 ) );

	}

}