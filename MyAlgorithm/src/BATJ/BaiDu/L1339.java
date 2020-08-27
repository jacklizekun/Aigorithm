package BATJ.BaiDu;

public class L1339 {

	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	  }
	  
	  int mod=1000000007,derta=mod,allSum;
	    public void sumOfTree(TreeNode root){
	        int res=0;
	        if(root.left!=null){
	            sumOfTree(root.left);
	            res+=root.left.val;
	        }
	        if(root.right!=null){
	            sumOfTree(root.right);
	            res+=root.right.val;
	        }
	        root.val+=res;
	    }
	    public void calDerta(TreeNode root){
	        if(root.left!=null){
	            calDerta(root.left);
	            derta=Math.min(derta,Math.abs(allSum-2*root.left.val));
	        }
	        if(root.right!=null){
	            calDerta(root.right);
	            derta=Math.min(derta,Math.abs(allSum-2*root.right.val));
	        }
	    }
	    public int quickMultiply(int x,int y){
	        int res=0;
	        while(y!=0){
	            if((y&1)==1){
	                res+=x;
	                res%=mod;
	            }
	            y>>=1;
	            x<<=1;
	            x%=mod;
	        }
	        return res;
	    }
	    public int maxProduct(TreeNode root) {
	        sumOfTree(root);
	        allSum=root.val;
	        calDerta(root);
	        int x1=(allSum-derta)/2,x2=allSum-x1;
	        return quickMultiply(x1,x2);
	    }

}
