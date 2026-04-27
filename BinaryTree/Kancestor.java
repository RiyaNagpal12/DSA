This program finds the k-th ancestor of a given node in a binary tree using recursion.

Approach:
- Traverse the tree to locate the target node.
- Return distance (level) from the target node while backtracking.
- When the distance becomes equal to k, print the ancestor node.

Key Idea:
The function returns -1 if the node is not found, otherwise returns the distance from the target node.

Time Complexity: O(n)
Space Complexity: O(h) (recursion stack)
