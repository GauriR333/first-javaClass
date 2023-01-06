package com.gauri.Box;

class BoxDemo {
	int width;
	int height;
	int depth;

	public static void main(String args[]) {
		BoxDemo BoxNo1 = new BoxDemo();
		double volume;

		BoxNo1.depth = 10;
		BoxNo1.height = 20;
		BoxNo1.width = 30;

		volume = BoxNo1.depth * BoxNo1.height * BoxNo1.width;
		System.out.println("Volume of Box is = " + volume);
	}
}
