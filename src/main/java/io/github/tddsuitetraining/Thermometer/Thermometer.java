package io.github.tddsuitetraining.Thermometer;

public record Thermometer(int[] temperatures) {

  public int getClosestTemperatureToZero() {
    return 1;
  }
}
