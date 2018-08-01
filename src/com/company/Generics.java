package com.company;

public class Generics {

    public Generics(){
        Container<String,String> c1 = new Container<String,String>( "name","hello");
        Container<String,Integer> c2 = new Container<String,Integer>( "age",22);
        Container<Double,Double> c3 = new Container<Double,Double>(1.1,1.3);
        System.out.println(c1.getKey()	+	"	:	"	+	c1.getValue());
        System.out.println(c2.getKey()	+	"	:	"	+	c2.getValue());
        System.out.println(c3.getKey()	+	"	:	"	+	c3.getValue());

        Demo d = new Demo()	;
        //	实例化Demo对象
        String str = d.fun("汤姆")	;
        //	传递字符串
        int	i = d.fun(30)	;
        //传递数字，自动装箱
        System.out.println(str)	;
        //输出内容
        System.out.println(i)	;

        //泛型构造器
        /*允许在构造器签名中声 明类型形参，这样就产生了所谓的泛型构造器。
        和使用普通泛型方法一样没区别，一种是显式指定泛型参数，
        另一种是隐式推断， 如果是显式指定则以显式指定的类型参数为准，
        如果传入的参数的类型和指定的类 型实参不符，将会编译报错。
         */
        //隐式
        new	Person(22);
        //显示
        new<String>	Person("hello");

    }

    //泛型定义
    public static class	Container<K,V>	{
        private	K key;
        private	V value;

        public Container(K	k, V v)
        {
            key	= k;
            value = v;
        }
        public K getKey(){
            return	key;
        }
        public V getValue()	{
            return	value;
        }
        public void setKey() {
            this.key = key;
        }
        public void setValue() {
            this.value = value;
        }
    }

    //在类、接口中没有使用泛型时，定义方法时想定义类型形 参，就会使用泛型方法
    class Demo{
        public <T> T fun(T t) {
            //可以接收任意类型的数据
            return t;
            // 直接把参数返回
        }
    }

    public class Person	{
        public <T> Person(T t) {
            System.out.println(t);
        }
    }

}
