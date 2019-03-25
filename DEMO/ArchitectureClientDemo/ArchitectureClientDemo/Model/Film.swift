//
//  Film.swift
//  ArchitectureClientDemo
//
//  Created by Midrash Elucidator on 2019/3/21.
//  Copyright © 2019 Midrash Elucidator. All rights reserved.
//

import Foundation

struct Film {
    let name: String
    let imageName: String
    
    
    
    static func getData() -> [Film] {
        return [
            Film(name: "朝花夕誓", imageName: "film1"),
            Film(name: "流浪地球", imageName: "film2"),
            Film(name: "你的名字", imageName: "film3"),
            Film(name: "冰雪奇缘", imageName: "film4")
        ]
    }
}
