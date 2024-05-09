public class Friend {
    private static int[] parent;//根
    private static int[] depth;//根までの深さ(距離)

    //初期化
    public Friend(int num){
        parent = new int[num];
        depth = new int[num];

        //最初は全て自分自身が根で、ランクは０
        for (int i = 0; i < num; i++) {
            parent[i] = i+1;
            depth[i] = 0;
        }
    }

    //友達関係を作る
    public void makeFriend(int a, int b){
        //aとbの根を探す
        int aRoot = findRoot(a);
        int bRoot = findRoot(b);
        
        //aとbの根が同じとき
        if(aRoot == bRoot){
            return;
        }

        //aとbの根が異なるとき
        //深さが小さい方を大きい方につなげる
        if(depth[aRoot-1] < depth[bRoot-1]){
            parent[aRoot-1] = bRoot;
        } 
        else if(depth[a-1] > depth[bRoot-1]){
            parent[bRoot-1] = aRoot;
        } 
        //深さがおなじ場合はaにつなげる
        else{
            parent[b-1] = aRoot;
            depth[aRoot-1]++;
        }
    }

    //友達関係かどうか
    public boolean findFriend(int a, int b){
        return findRoot(a) == findRoot(b); 
    }

    //根の検索
    public int findRoot(int a){
        if(a != parent[a-1]){
            parent[a-1] = findRoot(parent[a-1]);
        }

        return parent[a-1];
    }

}

