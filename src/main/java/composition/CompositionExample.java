package composition;

public class CompositionExample {

    private final Rule rule;

    public CompositionExample(Rule rule) {
        this.rule = rule;
    }

    public void exampleMethod() {
        rule.genericRuleMethod();
    }
}
