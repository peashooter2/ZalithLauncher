package com.movtery.zalithlauncher.ui.fragment.download.addon

import com.movtery.zalithlauncher.R
import com.movtery.zalithlauncher.feature.version.install.Addon

class DownloadQuiltApiFragment: DownloadFabricLikeApiModFragment(
    Addon.QSL,
    "qvIfYCYJ",
    "https://modrinth.com/mod/qsl",
    "https://www.mcmod.cn/class/6246.html",
    R.drawable.ic_quilt
) {
    companion object {
        const val TAG: String = "DownloadQuiltApiFragment"
    }
}