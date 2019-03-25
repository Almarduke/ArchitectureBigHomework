//
//  FilmVC.swift
//  ArchitectureClientDemo
//
//  Created by Midrash Elucidator on 2019/3/21.
//  Copyright © 2019 Midrash Elucidator. All rights reserved.
//

import UIKit

class FilmVC: UIViewController {
    

    @IBOutlet weak var filmCollectionView: UICollectionView!
    
    var filmList: [Film] = []
    

    override func viewDidLoad() {
        super.viewDidLoad()
        filmList = Film.getData()
        filmCollectionView.dataSource = self
        filmCollectionView.delegate = self
        setCollectionLayout()
    }
    
    private func setCollectionLayout() {
        let cellNumPerLine: CGFloat = UIDevice().model == "iPad" ? 3 : 2
        let layout = filmCollectionView.collectionViewLayout as! UICollectionViewFlowLayout
        let space: CGFloat = 20
        let width = (view.frame.size.width - space * (cellNumPerLine + 1)) / cellNumPerLine
        let height = width * 53 / 36
        layout.itemSize = CGSize(width: Int(width), height: Int(height))
    }
    
   /*
    private func refreshAchievements(of year: Int) {
        selectedYear = year
        titleButton.setTitle("\(year)", for: .normal)
        cellInfoList.removeAll()
        for month in MonthEnum.getKeyList() {
            let monthNumber = month.getNumber()
            let minutes = PlantRecord.loadTotalTime(year: year, month: monthNumber)
            let text = "\(month.translate()) \(TimeTool.minuteFormat(of: minutes))"
            let interactionEnabled = minutes > 0
            cellInfoList.append((monthNumber, text, interactionEnabled))
        }
        collectionView.reloadData()
    }
    
    @IBAction func close(_ sender: UIBarButtonItem) {
        dismiss(animated: true, completion: nil)
    }
    
    @objc func displayYearSelector() {
        yearSelector.isButtonsHidden = !yearSelector.isButtonsHidden
        collectionView.isUserInteractionEnabled = yearSelector.isButtonsHidden
    }
    
    @objc func showAchievements(ofyear year: Int) {
        displayYearSelector()
        refreshAchievements(of: year)
    }
 */
}

extension FilmVC: UICollectionViewDelegate, UICollectionViewDataSource {
    
    func collectionView(_ collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return filmList.count
    }
    
    func collectionView(_ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath) -> UICollectionViewCell {
        let cell = collectionView.dequeueReusableCell(withReuseIdentifier: "FilmCell", for: indexPath) as! FilmCell
        cell.film = filmList[indexPath.row]
        return cell
    }
    
}
