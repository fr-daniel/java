/**
 * IPromocional
 */

@FunctionalInterface
public interface IPromocional {
    boolean aplicaDescontoDe(double porcetagem);

    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}