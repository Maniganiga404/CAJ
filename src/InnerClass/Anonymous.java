package InnerClass;

public class Anonymous {
    abstract class Base{
        abstract void method();
    }
    interface Calculator{
        int add();
        int sub();
        int mul();
        int div();

    }
    public void main() {
        Base base = new Base() {
            @Override
            void method() {


            }
        };

        Calculator calculator = new Calculator() {
            @Override
            public int add() {
                return 0;
            }

            @Override
            public int sub() {
                return 0;
            }

            @Override
            public int mul() {
                return 0;
            }

            @Override
            public int div() {
                return 0;
            }
        };
    }
}


