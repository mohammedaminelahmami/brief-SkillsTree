import React, { useState } from 'react'
import apprenant1 from "../assets/imgs/apprenant/apprenant1.jpg";
import "../css/style.css";
import level1 from "../assets/imgs/lvl1.png"
import level2 from "../assets/imgs/lvl2.png"
import level3 from "../assets/imgs/lvl3.png"

const User = () => {
    //
    return (
        <div className="w-24 h-24 user_an">
            <div class="flip">
                <div class="flip-content">
                    <div class="flip-front">
                        <img src={apprenant1} className="w-full rounded-md" />
                        <p className="text-xs font-semibold">Jaouad&nbsp;DOUFARE</p>
                    </div>

                    <div class="flip-back">
                        <div className="flex flex-col justify-center gap-1">
                            <div className="flex gap-4">
                                <img src={level1} width="30" height="30" />
                                <p className="text-green-500 text-sm font-semibold">70%</p>
                            </div>
                            <div className="flex gap-4">
                                <img src={level2} width="30" height="30" />
                                <p className="text-blue-500 text-sm font-semibold">10%</p>
                            </div>
                            <div className="flex gap-4">
                                <img src={level3} width="30" height="30" />
                                <p className="text-orange-500 text-sm font-semibold">20%</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default User