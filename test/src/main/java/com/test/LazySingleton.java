    package com.test;
    
    public class LazySingleton {
        private static LazySingleton lazySingleton;

        public static LazySingleton getInstance() {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }

        public void test() {
            System.out.println("LazySingleton");
        }
    }
    