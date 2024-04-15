public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> s1 = new Stack<>();
        int height1 = 0;
        Stack<Integer> s2 = new Stack<>();
        int height2 = 0;
        Stack<Integer> s3 = new Stack<>();
        int height3 = 0;
        
        for (int i = 0; i < h1.size(); i++) {
            height1 += s1.push(h1.get(i));
        }
        System.out.println(height1);
        for (int i = 0; i < h2.size(); i++) {
            height2 += s2.push(h2.get(i));
        }
        System.out.println(height2);
        
        for (int i = 0; i < h3.size(); i++) {
            height3 += s3.push(h3.get(i));
        }
        System.out.println(height3);
        
        while (!(height1 == height2 && height2 == height3 && height3 == height1)) {
            if (height1 < height2) {
                height2 -= s2.pop();
                System.out.println(height2);
            }
            else if (height2 < height3) {
                height3 -= s3.pop();
                System.out.println(height3);

            }
            else if (height3 < height1) {
                height1 -= s1.pop();
                System.out.println(height1);

            }
        }
        return height1;
    }
