class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        search(root, result);
        return result;
    }

    public void search (TreeNode root, List<Integer> result) {
        if (root != null) {
            search(root.left, result);
            result.add(root.val);
            search(root.right, result);
        } 
    }
}
