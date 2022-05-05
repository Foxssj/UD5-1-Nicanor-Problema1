package com.queueSystem;

public class Collection {
     private final int DEFAULT_CAPACITY = 5;
     private float data[] = null;
     private int length = 0;

     public Collection(int initialCapacity) {
          data = new float[initialCapacity];
     }

     public Collection() {
          data = new float[DEFAULT_CAPACITY];
     }

     public float getElement(int position) {
          return data[position];
     }

     public int length() {
          return length;
     }

     public void insert(float element, int position) {
          if (length == data.length ) {
               float []aux = data;
               data = new float[data.length *2];

               for (int i = 0; i < aux.length; i++) {
                    data[i] = aux[i];
               }
               aux = null;
          }
          for (int i = length - 1; i >= position ; i--) {
               data[i + 1] = data[i];
          }
          data[position] = element;
          length++;
     }

     public void add(float element) {
          insert(element, length);
     }

     public Object delete(int position) {
          Object aux = data[position];
          for (int i = position; i < length - 1; i++) {
               data[i] = data[i + 1];
          }
          length--;
          return aux;
     }

     @Override
     public String toString() {
         if (length == 0) {
              return "<Empty>";
         }
         String out = "";
          for (int i = 0; i < length; i++) {
               out += data[i];
          }
          return out;
     }
}
