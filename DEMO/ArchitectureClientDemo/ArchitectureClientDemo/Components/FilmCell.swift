//
//  FilmCell.swift
//  ArchitectureClientDemo
//
//  Created by Midrash Elucidator on 2019/3/21.
//  Copyright © 2019 Midrash Elucidator. All rights reserved.
//

import UIKit

class FilmCell: UICollectionViewCell {
    
    @IBOutlet weak var filmImage: UIImageView!
    
    var film: Film! {
        didSet {
            filmImage.image = UIImage(named: film.imageName)
        }
    }
}
