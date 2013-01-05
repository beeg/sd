package es.deusto.ingenieria.sd.tralala.player.gui;

import javax.swing.JFrame;

import es.deusto.ingenieria.sd.tralala.player.controller.PlayerController;

public class MainWindow extends JFrame{

	PlayerController controller;
    private javax.swing.JButton bAccount;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPlay;
    private javax.swing.JButton bPrevious;
    private javax.swing.JButton bRecommendation;
    private javax.swing.JButton bRemove;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bShowFavourites;
    private javax.swing.JButton bShowPermanent;
    private javax.swing.JLabel lFriends;
    private javax.swing.JList listFriends;
    private javax.swing.JScrollPane sList;
    private javax.swing.JScrollPane sTable;
    private javax.swing.JTextField tAlbum;
    private javax.swing.JTextField tAuthor;
    private javax.swing.JTextField tSongName;
    private javax.swing.JTable tSongs;
	
	public MainWindow()	{
		tSongName = new javax.swing.JTextField();
        tAuthor = new javax.swing.JTextField();
        tAlbum = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        bShowFavourites = new javax.swing.JButton();
        bShowPermanent = new javax.swing.JButton();
        sList = new javax.swing.JScrollPane();
        listFriends = new javax.swing.JList();
        lFriends = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bRemove = new javax.swing.JButton();
        sTable = new javax.swing.JScrollPane();
        tSongs = new javax.swing.JTable();
        bPrevious = new javax.swing.JButton();
        bPlay = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        bRecommendation = new javax.swing.JButton();
        bAccount = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tSongName.setText("SongName");
        tAuthor.setText("Author");
        tAlbum.setText("Album");
        bSearch.setText("Search");
        bShowFavourites.setText("Show Favourites");
        bShowPermanent.setText("Show Permanent List");

        listFriends.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        sList.setViewportView(listFriends);
        lFriends.setText("Friends");
        bAdd.setText("Add");
        bRemove.setText("Remove");
        tSongs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sTable.setViewportView(tSongs);
        bPrevious.setText("<<");
        bPlay.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bego\\Downloads\\play.png")); // NOI18N
        bNext.setText(">>");
        bRecommendation.setText("Open Recommendation");
        bAccount.setText("Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tSongName, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(tAuthor)
                            .addComponent(tAlbum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bShowFavourites)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bShowPermanent)
                                .addGap(18, 18, 18)
                                .addComponent(lFriends)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bAccount))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sList, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bRecommendation)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(bRemove)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(bPrevious)
                .addGap(37, 37, 37)
                .addComponent(bPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tSongName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAccount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSearch)
                            .addComponent(bShowFavourites)
                            .addComponent(bShowPermanent)))
                    .addComponent(lFriends, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sList, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bAdd)
                                    .addComponent(bRemove)))
                            .addComponent(sTable, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bPrevious))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(bNext))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPlay))))
                    .addComponent(bRecommendation, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
	}
	
public static void main(String[] args)	{
	MainWindow mw = new MainWindow();
	mw.setVisible(true);
}

}
