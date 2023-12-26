import linkedlist.Node;
import multithreading.RandomNumberGenerator;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main_classes {

    public static void main (String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {

//        System.out.println("Generating JWT snd Signing with Private Key...........");
//        RSAPrivateKey privateKey = (RSAPrivateKey) getPrivateKey("Your file path here/private.der");
//        String jwtToken = createJWTAndSign("PO2kUuLlAk3c8TGGzzb5HL2zoAxinkQqIEQWDxGr5voAwItv", "PO2kUuLlAk3c8TGGzzb5HL2zoAxinkQqIEQWDxGr5voAwItv", "https://tapi.omnifymena.com", privateKey);
//        System.out.println("JWT Token:");
//        System.out.println(jwtToken);
    }

//    private static String createJWTAndSign(String issuer, String subject, String audiance, RSAPrivateKey privateKey) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
//
//
//        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.RS256;
//
//        Date date = new Date();
//
//
//        JwtBuilder builder = Jwts.builder()
//                .setAudience(audiance)
//                .setIssuer(issuer)
//                .setNotBefore(notBeforeTime())
//                .setIssuedAt(iatTime())
//                .setExpiration(createExpireTime())
//                .setSubject(subject)
//                .signWith(signatureAlgorithm, privateKey);
//
//        return builder.compact();
//
//    }
//    private static Date iatTime() {
//        Calendar calendar = Calendar.getInstance();
//        Date currentTime = calendar.getTime();
//        return currentTime;
//    }



}

//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//
////        System.out.println("Hello-World by - "+Thread.currentThread().getName());
////
////        PrintHelloWorld printHelloWorld = new PrintHelloWorld();
////
////        Thread t1 = new Thread(printHelloWorld);
////        t1.run();
//
////        for(int i =1;i<=100;i++){
////            NumberPrinter numberPrinter = new NumberPrinter(i);
////            Thread t = new Thread(numberPrinter);
////            t.start();
////        }
//
//
////        ExecutorService executorService = Executors.newFixedThreadPool(10);
////        for(int i =1;i<=100;i++){
////            if(i ==1 || i ==51||i==100){
////                System.out.println("hello");
////            }
////            NumberPrinter numberPrinter = new NumberPrinter(i);
////            executorService.submit(numberPrinter);
////        }
//
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        RandomNumberGenerator r1 = new RandomNumberGenerator();
//        RandomNumberGenerator r2 = new RandomNumberGenerator();
//        Future<Integer> random1 = executor.submit(r1);
//        Future<Integer> random2 = executor.submit(r2);
//
//        int randomNumber1 = random1.get();
//        int randomNumber2 = random2.get();
//        System.out.println("SUM " + (randomNumber1 + randomNumber2) + " Thread : " + Thread.currentThread().getName());
//
////        Node head = new Node(10);
////        Node temp1 = new Node(20);
////        Node temp2 = new Node(30);
////
////        head.next = temp1;
////        temp1.next = temp2;
////  //      recursiveTraversalLinkedList(head);
//        //        Node node = Node.insertAtTheGivenPositionOfLinkedList(head,25,2);
////        System.out.println(node);
//        // print a linked list
////        while(head !=null){
////            System.out.println(head.data);
////            head = head.next;
////        }
//
//        //       linkedlist.doublyLinkedList.Node head = new linkedlist.doublyLinkedList.Node(10);
//
//        //      linkedlist.doublyLinkedList.Node temp1 =new linkedlist.doublyLinkedList.Node(20);
//
//
//    }
//
//    public static void recursiveTraversalLinkedList(Node head) {
//
//
//        if (head == null) return;
//
//        System.out.print(head.data + " ");
//        recursiveTraversalLinkedList(head.next);
//
//
//    }


