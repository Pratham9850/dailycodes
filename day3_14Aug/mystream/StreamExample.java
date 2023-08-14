package com.mystream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import java.util.function.Supplier;
import java.util.stream.IntStream;
public class StreamExample {
	
	static class FibonacciSupplier implements Supplier<Integer> {
        private int previous = 0;
        private int current = 1;

        
        public Integer get() {
            int next = previous + current;
            previous = current;
            current = next;
            return previous;
        }
    }
	
	static class PrimeSupplier implements Supplier<Integer> {
        private int current = 2;

        @Override
        public Integer get() {
            while (!isPrime(current)) {
                current++;
            }
            int prime = current;
            current++;
            return prime;
        }

        private boolean isPrime(int num) {
            return num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num))
                    .noneMatch(i -> num % i == 0);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        Stream<String> wordsStream = Stream.<String>builder()
                .add("BaudeRate")
                .add("Ohm")
                .add("Kilowatt")
                .add("Bits")
                .add("Analog")
                .add("Digital")
                .build();
        
        
        wordsStream.forEach(System.out::println);

     
        Stream<Integer> fibonacciStream = Stream.generate(new FibonacciSupplier());
        fibonacciStream.limit(10).forEach(System.out::println);

        
        Stream<Integer> primeStream = Stream.generate(new PrimeSupplier());
        primeStream.limit(10).forEach(System.out::println);
    }

	}


