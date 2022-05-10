package miscellaneus;

/*
 * Varargs is a short name for variable arguments.
 * In Java, an argument of a method can accept arbitrary number of values.
 * This argument that can accept variable number of values is called varargs.
 *
 *  --------Syntax : -------
 *
 * accessModifier methodName(datatype… arg) {
    // method body
}
*/

public class VarArgsDemo {
	public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
