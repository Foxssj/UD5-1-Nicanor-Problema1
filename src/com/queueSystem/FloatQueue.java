package com.queueSystem;
import com.queueSystem.Collection;

public class FloatQueue {
        private static final int CAPACIDAD_INICIAL = 5;
        private static final int TOP = 0;

        private Collection collection = new Collection(CAPACIDAD_INICIAL);

        public void enqueue(float element) {
                collection.add(element);
        }

        public float dequeue(){
                return (float) collection.delete(TOP);
        }

}
