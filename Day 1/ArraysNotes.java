// ARRAYS

/***** DEEP COPY -> Single-Dimentional ARRAYS JAVA      
 * When you clone a single-dimensional array, a “deep copy” is performed with the new array containing 
 * copies of the original array’s elements as opposed to references.
 * 
 * int intArray[] = { 1, 2, 3, 4 };
 * int cloneArray[] = intArray.clone();
 * System.out.println(intArray == cloneArray);          => FALSE
 * System.out.println(intArray[0] == cloneArray[0]);    => TRUE
 * 
 *****/

/***** SHALLOW COPY -> Multi-Dimentional ARRAY JAVA      
 * A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” however, which is to say 
 * that it creates only a single new array with each element array a reference to an original element array, 
 * but subarrays are shared.
 * 
 * int intArray[][] = {{1,2,3,4}, {4,5,6}};
 * int cloneArray[][] = intArray.clone();
 * System.out.println(intArray == cloneArray);          => FALSE
 * System.out.println(intArray[0] == cloneArray[0]);    => TRUE
 * 
 *****/

/*****  JAGGED ARRAYS are 2D of nD arrays with variable column size.
 *      Example:
 *      int [][] arr = {{1,2,3},{4,5,6,7,8},{9,10}};
 *****/