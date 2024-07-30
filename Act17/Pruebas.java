public class Pruebas{
    public static void main(String[] args) {

        HelloWorld saludoEspañol = new HelloWorld(){
            public void greet() {
                System.out.println("Hola!");
            }
            public void greetSomeone(String someone) {
                System.out.println("Hola " + someone + "!");
            }
        };
        
        HelloWorld greetingEnglish = new HelloWorld() {
            public void greet() {
                System.out.println("Hello!");
            }
            public void greetSomeone(String someone) {
                    System.out.println("Hello " + someone + "!");
            }
        };
        
        HelloWorld salutationFrançais = new HelloWorld() {
            public void greet() {
                System.out.println("Bonjour!");
                }
            public void greetSomeone(String someone) {
                System.out.println("Bonjour " + someone + "!");
                }
            };
        
        //Clases anónimas
        Person student = new Person() {
            public void work() {
                    System.out.println("El estudiante está en clase");
            }
        };

        student.setEdad(20);
        student.setSexo(Person.MALE);
        student.work();
        
        Person professor = new Person() {
            public void work() {
                System.out.println("El profesor está impartiendo cátedra");              
            }
        };

        professor.setEdad(30);
        professor.setSexo(Person.FEMALE);
        professor.work();

        saludoEspañol.greet();
        saludoEspañol.greetSomeone("Pedro");
        greetingEnglish.greet();
        greetingEnglish.greetSomeone("Albert");
        salutationFrançais.greet();
        salutationFrançais.greetSomeone("Antonio");

        student.work();
        professor.work();
        }
}


