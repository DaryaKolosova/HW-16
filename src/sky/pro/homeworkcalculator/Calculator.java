package sky.pro.homeworkcalculator;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator = new CalculatorServiceImpl();

    @GetMapping("/")
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculator.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculator.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculator.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if(num2 == 0) {
            return "Делить на 0 нельзя";
        }
        return num1 + " / " + num2 + " = " + calculator.divide(num1, num2);
    }
}


