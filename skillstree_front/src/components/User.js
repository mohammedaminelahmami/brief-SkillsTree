import React from "react";
import "../css/style.css";
import level1 from "../assets/imgs/lvl1.png";
import level2 from "../assets/imgs/lvl2.png";
import level3 from "../assets/imgs/lvl3.png";

const User = ({apprenant}) => {
    //
    return (
        <div className="w-24 h-24 user_an">
            <div className="flip">
                <div className="flip-content">
                    <div className="flip-front">
                        <img src={`https://intranet.youcode.ma/storage/users/profile/thumbnail/${apprenant.img}`} className="w-full rounded-md" />
                        <p className="text-xs font-semibold">{apprenant.nom}</p>
                    </div>

                    <div className="flip-back">
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