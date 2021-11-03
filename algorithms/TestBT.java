package algorithms;

import static algorithms.BT.*;

import org.junit.jupiter.api.Test;

public class TestBT {
    TreeNode root;
    {
        root = new TreeNode(5);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
    }

    public void print(TreeNode root, String... strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }
        inOrderTraverse(root);
        System.out.println();

    }

    public static void main(String[] args) {
        new TestBT().testFlatten();
    }

    @Test
    public void testCount() {

        System.out.println(count(root));
        inOrderTraverse(root);
    }

    @Test
    public void testFlatten() {
        print(root, "反转前: ");
        invertTreee(root);
        print(root, "反转后: ");
        flatten(root);
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }

    }

    @Test
    public void testSerialize() {
        String serialize = serialize(root);
        System.out.println("序列化: " + serialize);
        // TreeNode deserialize = deserialize(serialize);
        // print(deserialize, "反序列: ");
    }

}
