   //Our input is a binary string to be decoded along with the root
    //of the binary tree
	void decode(String s, Node root) {
        Queue<Character> characterQueue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            characterQueue.add(c);
        }
        
        Node currentNode = root;
        
        while (!characterQueue.isEmpty()) {
            //If the node is a leaf, print out the letter stored in the node
            //then go back to the root
            if (currentNode.left == null && currentNode.right == null) {
                System.out.print(currentNode.data);
                currentNode = root;
                continue;
            }
            //Move to the next letter
            char currentChar = characterQueue.remove();

            //Move to the left if the next character is a 0, otherwise move right
            if (currentChar == '0') {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        //Print out the letter at the final node
        if (currentNode.left == null && currentNode.right == null) {
                System.out.print(currentNode.data);
        }
    }
