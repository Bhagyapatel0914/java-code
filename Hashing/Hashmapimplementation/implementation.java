package Hashmapimplementation;

import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;

// It is the array of the LL
public class implementation {
    static class HashMap<K,V>{
        public class Node{
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n ; // n is the number of the node
        private int N ; // N is the number of the bucket
        private LinkedList<Node> [] bucket ; // imagine this thing as int [] arr
   // which say there is an array which store integer here it store LinkedList
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4]; // this thing we can imagine as the initializing array
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }
        public void put(K key , V value){
            int bucketindex = hashFuntion(key);
            // this will give the index of array of ll where key exist
            // Now we traverse through the each and every element in ll at particular index
            // to check either the key exist or not
            int dataindex =  searchinll(key,bucketindex); // if value exist then it will return 0+ else -1
            if (dataindex == -1){
                // so i add the new node at buket index
                bucket[bucketindex].add(new Node(key,value));
                n++;
            }else{ // if value already exist then update
                Node node = bucket[bucketindex].get(dataindex);
                node.value = value;
            }
            double lamda = (double) n / N;
            if (lamda>2){
                rehashing();
            }
        }
        private void rehashing() {
           LinkedList<Node> [] oldbucket = bucket;
           bucket = new LinkedList[2*N];
            for (int i = 0; i < 2*N; i++) {
              bucket[i] =  new LinkedList<>();
            }
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        private int searchinll(K key, int bucketindex) {
            LinkedList<Node> ll = bucket[bucketindex];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private int hashFuntion(K key) {
            int buketindex = key.hashCode();
            return Math.abs(buketindex) % N;
        }
        public V get(K key){
            int bucketindex = hashFuntion(key);
            int dataindex =  searchinll(key,bucketindex);
            if (dataindex == -1){
                return null ;
            }else{
                Node node = bucket[bucketindex].get(dataindex);
                return node.value;
            }
        }
        public boolean contain(K key){
            int bucketindex = hashFuntion(key);
            int dataindex =  searchinll(key,bucketindex);
            if (dataindex == -1){
                return false ;
            }else{
                return true;
            }
        }
        public V remove(K key){
            int bucketindex = hashFuntion(key);
            int dataindex =  searchinll(key,bucketindex);
            if (dataindex == -1){
                return null ;
            }else{
                Node node = bucket[bucketindex].remove(dataindex);
                n--;
                return node.value;
            }
        }
        public boolean isempty(){
            return n==0;
        }
        public ArrayList<K> keyset(){
            ArrayList<K> list = new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
              LinkedList<Node> ll =   bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                     list.add(node.key);
                }
            }
            return list;
        }
    }
}
