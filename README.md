Introduction to Merkle Tree :

Merkle tree is a tree data structure with leaf nodes and non-leaf nodes. It also known as Hash tree. The reason behind it is it only stores the hashes in its nodes instead of data. In its leaf nodes, it will store the hash of the data. Non leaf nodes contain the hash of its children. Ralph C. Merkle (born February 2, 1952) is a computer scientist. He is one of the inventors of public key cryptography, the inventor of hashing. He is also the inventor of MERKEL tree. Merkle tree (Hash tree) is used to verify any kind of data stored, handled and transferred in and between computers. Currently, the main use of Merkle tree is to make sure that data blocks received from other peers in a peer-to-peer network are received undamaged and unaltered, and even to check that the other peers do not lie and send fake blocks. Merkle tree is used in git, Amazon's Dynamo, Cassandra as well as BitCoin. Merkle Tree is one of the core data structures which is used in the BitCoin blockchain to verify the existence of a transaction in a way that conserves both space and time quite effectively Merkle trees produce an overall digital fingerprint of the entire set of transactions, providing a very efficient process to verify whether a transaction is included in a block. The important thing is to check to contain specific transaction in a block. In order to that, use Merkle root. Each block in the BitCoin blockchain contains a summary of all the transactions in the block, using a Merkle tree. 

USAGES:

1.Merkle trees (also known as hash trees) are used to validate any type of data that is stored, managed, or transported between computers. 2.Merkle tree is now used to ensure that data blocks received from other peers in a peer-to-peer network are received intact and undamaged, as well as to ensure that the other peers do not deceive and send phoney blocks. 3.Merkle tree is used in git, Amazon's Dynamo, Cassandra as well as BitCoin.

ROLE OF MERKLE TREE IN BLOCK CHAIN:

1.Merkle Tree is one of the most important data structures in the Bitcoin blockchain, as it is used to validate the presence of a transaction in a way that saves both space and time.

2.Merkle trees generate a digital fingerprint of the complete set of transactions, allowing for a quick check to see if a transaction is part of a block.

TIME COMPLEXITY RELATED TO MERKLE TREE:

The time complexity for searching is O(log n) because the time complexity for searching in a binary tree is O(log n).

The time complexity for insertion is O(log n).

The time complexity for deletion is O(log n).

The space complexity is O( n ).

ALGORITHM:

ALGORITHM OF FIND FUNCTION IN MERKLE TREE

Step 1: We will take tree and key as para meters.

Step 2: If the tree is null then we will return null.

Step 3: If the tree->key is equal to the key we will return the tree.

Step 4: If the key is smaller than tree->key then we will return find(tree->left, key)

Step 5: else return find(tree->right, key)

ALGORITHM TO ADD A NODE IN MERKLE TREE.

Step 1: We will take key and value as parameters.

Step 2: Take the hash(key) and store it in a variable called index.

Step 3: store (struct node*) arr[index].head in a pointer called tree of datatype node.

Step 4: create a new node with its key as key and value as value and both links as null.

Step 5: If the tree is null then assign the new node to the head and increment the size by 1.

Step 6: If the tree is not null then we will check if the key is already present in the tree using the find function.

Step 7: If the key is already present in the tree then we will update the value.

Step 8: If it is not present in the tree then we will use the insert function to insert the element.

ALGORITHM OF INSERT FUNCTION.

Step 1: It will take tree and item pointers of node data type as parameters.

Step 2: If item->key is smaller than tree->key and tree->left is null then assign the item to tree->left.

Step 3: If item->key is smaller than tree->key and tree->left is not null then call insert function with tree->left and item as parameters.

Step 4: If item->key is greater than tree->key and tree->right is null then assign the item to tree->right.

Step 5: If item->key is greater than tree->key and tree->right is not null then call insert function with tree->right and item as parameters.

ALGORITHM TO DELETE A NODE IN MERKLE TREE.

Step 1: We will take a key as a parameter.

Step 2: Take the hash(key) and store it in a variable called index.

Step 3: store (struct node*) arr[index].head in a pointer called tree of datatype node.

Step 4: If the tree is null then the key is not present.

Step 5: If the tree is not null then we will check if the key is already present in the tree using the find function.

Step 6: If the find function returns null then the key is not present in the tree.

Step 7: If it is not null then we will use the remove function to delete the element.

ALGORITHM OF REMOVE FUNCTION.

Step 1: It will take tree and key as parameters.

Step 2: If the tree is null then return null.

Step 3: If the key is smaller than the tree->key then tree->left is equal to remove(tree->left, key) and return tree.

Step 4: If the key is greater than the tree->key then tree->right is equal to remove(tree->right, key) and return tree.

Step 5: else if the tree->left is equal to null and the tree->right is equal to null then decrement the size and return tree->left.

Step 6: else if the tree->left is not equal to null and the tree->right is equal to null then decrement the size and return tree->left.

Step 7: else if tree->left is equal to null and tree->right is not equal to null then decrement the size and return tree->right.

Step 8: else assign tree->left to a pointer called left of data type node.

Step 9: While left->right is not equal to null, left is equal to left->right.

Step 10: tree->key is equal to left->key.

Step 11: tree->value is equal to left->value.

Step 12: tree->left is equal to remove(tree->left, tree->key).

Step 13: Return tree..




