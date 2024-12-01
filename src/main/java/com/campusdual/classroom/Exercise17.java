package com.campusdual.classroom;


public class Exercise17 {

	public static int[] createEmptyIntArray(int positions) {
		//inicializo el array estableciendo las posiciones enviadas por parametro
		int [] intArray = new int[positions];
		return intArray;
	}


	public static String[] createInitializedStringArray() {
		//declaro e inicializo un array de tipo string
		String [] stringArray = new	String[3];
		//se añade los valores para cada indice
		stringArray[0] = "1";
		stringArray[1] = "2";
		stringArray[2] = "3";
		return stringArray;
	}


	public static void populateArray(int[] array, int index, int value) {
		//establecemos las posiciones del array con lo que se reciba en el parametro index
		//establecemos el valor dentro de cada posicion con lo que se envia por parametro value
		array[index] = value;
	}

	public static int arrayLength(int[] array) {
		//enviamos por parametro un array de tipo entero
		//devolvemos un valor de tipo entero que muestra la longitud del array enviado por parametro
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		//mostramos por consola el valor que se encuentra en la posicion enviada por parametro (index)
		System.out.println(array[index]);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
