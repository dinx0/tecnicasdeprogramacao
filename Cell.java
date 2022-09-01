public class Cell {
  double[] u = new double[Config.NUM_RK_STEPS+1];
  double uWest, uEast;
  double cx;
  double dx;
}