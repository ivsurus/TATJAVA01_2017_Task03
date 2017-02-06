package com.epam.catalog.experiment;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Experim {
    private int calc(int a, int b){
        return a + b;
    }
    public String Stroki(String a, String b ){
        return a + b;
    }
}
class Inspector{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Experim obj = new Experim();
        Class c = obj.getClass();

        Class[] paramTypes = new Class[] {int.class, int.class};

        Method method = c.getDeclaredMethod("calc", paramTypes);
        method.setAccessible(true);
        Object[] argsa = new Object[] { new Integer(2), new Integer(3) };
        System.out.println(method.invoke(obj,argsa));

       /* Class[] paramTypes = new Class[] {String.class, String.class};
        Method method = c.getMethod("Stroki", paramTypes);
        Object[] argsa = new Object[] { new String("First Calculate "), new String("Ivan") };
        System.out.println(method.invoke(obj,argsa));*/



        /*System.out.println(c);
        Method[] methods = c.getMethods();

        for (Method method : methods) {
            System.out.println("Имя: " + method.getName());
            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Типы параметров: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }*/


    }
}
