
SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
HOMEPAGE = "https://aka.ms/debugpy"
AUTHOR = "Microsoft Corporation <ptvshelp@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b6b095fe2a2e2b66cb08d295b605789"

SRC_URI = "https://files.pythonhosted.org/packages/61/fe/0486b90b9ac0d9afced236fdfe6e54c2f45b7ef09225210090f23dc6e48a/debugpy-1.8.0.zip"
SRC_URI[sha256sum] = "12af2c55b419521e33d5fb21bd022df0b5eb267c3e178f1d374a63a2a6bdccd0"

S = "${WORKDIR}/debugpy-1.8.0"

DEPENDS += "\
"

inherit setuptools3

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"