package com.example.jeffdempsey.tempconverter;

public class ConverterUtil {
        //converts F to C
        public static float convertFahrenheitToCelsius(float fahrenheit)
        {
            return ((fahrenheit -32) * 5 / 9);
        }

        //converts C to F
        public static float convertCelsiusToFahrenheit(float celsius)
        {
            return ((celsius * 9) / 5) + 32;
        }
}
